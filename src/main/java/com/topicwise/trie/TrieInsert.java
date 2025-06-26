package com.topicwise.trie;

public class TrieInsert {
  public void insert(String str, TrieNode root) {
    TrieNode curNode = root;
    for(int i = 0; i < str.length(); i++){
      int index = str.charAt(i) - 'a';
      if(null == curNode.child[index]){
        curNode.child[index] = new TrieNode();
      }
      curNode = curNode.child[index];
    }
    curNode.isEnd = true;
  }

  public static void main(String [] arr){

  }
}
