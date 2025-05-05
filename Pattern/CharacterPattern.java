public class CharacterPattern {
    public static void main(String[] args) {
        char ch;
        for(int i = 0 ; i < 5 ; i++){
            ch = 'A';
            for(int j = 0 ; j <= i ; j++){
                
                System.out.print(ch+" ");
                ch += 1;
            }
            System.out.println();
        }
    }
}
