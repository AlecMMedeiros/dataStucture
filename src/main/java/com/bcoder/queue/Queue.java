package com.bcoder.queue;

public class Queue {
  private Node refEntryNode;

  public Queue ( ) {
    this.refEntryNode = null;
  }

  public void enqueue ( Node newNode ) {
    newNode.setRefNode ( this.refEntryNode );
    this.refEntryNode = newNode;
  }

  public Node dequeue ( ) {
    if (!this.isEmpty ( )) {
      Node firstNo = this.refEntryNode;
      Node auxliarNode = this.refEntryNode;
      while (true) {
        if (firstNo.getRefNode ( ) != null) {
          auxliarNode = firstNo;
          firstNo = firstNo.getRefNode ( );
        } else {
          auxliarNode.setRefNode ( null );
          break;
        }
      }
      return firstNo;
    }
    return null;
  }

  ;

  public Node first ( ) {
    if (!this.isEmpty ( )) {
      Node firstNo = this.refEntryNode;
      while (true) {
        if (firstNo.getRefNode ( ) != null) {
          firstNo = firstNo.getRefNode ( );
        } else {
          break;
        }
      }
      return firstNo;
    }
    return null;
  }

  ;

  public boolean isEmpty ( ) {
    if (this.refEntryNode == null) {
      return true;
    }
    return false;
  }

  @Override
  public String toString ( ) {
    String stringReturn = "--------------\n";
    stringReturn += "    Queue\n";
    stringReturn += "--------------\n";

    Node nodeAuxiliar = refEntryNode;


    if (nodeAuxiliar != null) {
      while (true) {
        if (nodeAuxiliar.getRefNode ( ) != null) {
          stringReturn += "[Node{data=" + nodeAuxiliar.getObject ( ) + "}], ";
          nodeAuxiliar = nodeAuxiliar.getRefNode ( );
        } else {
          stringReturn += "[Node{data=" + nodeAuxiliar.getObject ( ) + "}] ";
          break;
        }
      }
    } else {
      stringReturn = "null";
    }
    // Retorna a string de retorno
    return stringReturn;
  }
}
