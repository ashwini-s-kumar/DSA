package com.topicwise.trie;

public class TrieSearch {
  public boolean search(String str, TrieNode root) {
    TrieNode curNode = root;
    for(int i = 0; i < str.length(); i++){
      int index = str.charAt(i) - 'a';
      if(null == curNode.child[index]){
        return false;
      }
      curNode = curNode.child[index];
    }
    return curNode.isEnd;
  }
}
