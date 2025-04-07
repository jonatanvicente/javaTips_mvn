


## Command Pattern


The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. 
This transformation allows for parameterizing methods with different requests, queuing or logging requests, and supporting undoable operations. 
Here are some use cases of the Command Pattern in Java:
* **Undo/Redo functionality**: Each command can be stored in a history list, allowing the application to undo or redo operations.
* **Transaction management**: Commands can be used to encapsulate all the information needed to perform a transaction, making it easier to manage and rollback transactions.
* **Macro recording**: Commands can be recorded and executed later, allowing for macro functionality where a series of operations can be recorded and replayed.
* **Task scheduling**: Commands can be scheduled to run at a later time or periodically.
* **Network requests**: Commands can be used to encapsulate network requests, making it easier to queue, retry, or log requests.


In this example:
* The Command interface declares the execute method.
* The LightOnCommand class implements the Command interface and encapsulates the action of turning on the light.
* The Light class is the receiver that performs the actual action.
* The RemoteControl class is the invoker that triggers the command.
* The Client class sets up the command and invokes it through the invoker.