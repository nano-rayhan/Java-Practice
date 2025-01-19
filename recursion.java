public class recursion {

    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println(n + "-->" + src + "-->" + dest);
            return;
        }
        towerofHanoi(n-1, src, dest, dest);
        System.out.println(n + "-->" +src +"-->" + dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 5;

        towerofHanoi(n, "S", "H", "D");
    }
}
