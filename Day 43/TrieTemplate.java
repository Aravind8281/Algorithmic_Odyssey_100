import java.util.*;
class Trie{
    private static Trienode root;
    static class Trienode{
        private static Trienode[] children;
        private static boolean flag;
        public Trienode(){
            this.children=new Trienode[26];
            this.flag=false;
        }
    }
}
