package com.bcoder.stack;

public class Stack {
  private Node refEntryNode = null;

  public Stack ( ) {
    this.refEntryNode = null;
  }

  public void push(Node newNode) {
    // Salva a referência atual para o topo da pilha em uma variável auxiliar
    Node refAuxiliar = this.refEntryNode;
    // Atualiza a referência para o topo da pilha para apontar para o novo nó
    this.refEntryNode = newNode;
    // Define a referência do novo nó para o nó que antes era o topo da pilha
    newNode.setRefNo(refAuxiliar);
  }

  public Node pop() {
    // Verifica se a pilha não está vazia
    if (!this.isEmpty()) {
      // Salva a referência para o nó atualmente no topo da pilha em uma variável
      Node nodePoped = this.refEntryNode;
      // Atualiza a referência para o topo da pilha para apontar para o segundo nó
      this.refEntryNode = refEntryNode.getRefNode();
      // Retorna a referência para o nó removido da pilha
      return nodePoped;
    }
    // Se a pilha estiver vazia, retorna null
    return null;
  }


  public Node top() {
    return this.refEntryNode;
  }
  public boolean isEmpty(){
    if (this.refEntryNode == null) return true;
    return false;
  }

  @Override
  public String toString() {
    // Cria a string de retorno inicial com o título "Pilha" e algumas linhas de separação
    String stringReturn = "--------------\n";
    stringReturn += "    Stack\n";
    stringReturn += "--------------\n";

    // Inicializa a variável de referência auxiliar com a referência para o topo da pilha
    Node nodeAuxiliar = refEntryNode;

    // Itera sobre a pilha usando um laço "while"
    while (true) {
      // Verifica se o nó auxiliar é nulo
      if (nodeAuxiliar != null) {
        // Adiciona a representação em texto do nó atual à string de retorno
        stringReturn += "[Node{data=" + nodeAuxiliar.getData() + "}]\n";
        // Atualiza a variável de referência auxiliar para apontar para o próximo nó
        nodeAuxiliar = nodeAuxiliar.getRefNode();
      } else {
        // Se o nó auxiliar for nulo, todos os elementos da pilha foram processados
        break;
      }
    }

    // Adiciona mais algumas linhas de separação à string de retorno
    stringReturn += "==============\n";
    // Retorna a string de retorno
    return stringReturn;
  }

}
