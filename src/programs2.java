public class programs2 {
    public static void main(String[]args){
        String[]friends= {"sushant", "devendra", "sandy"};
        for (String friend: friends) {
            System.out.println("friend: "+friend);

            for (char element:friend.toCharArray()){
                System.out.println(element);

            }
        }

     }
}
