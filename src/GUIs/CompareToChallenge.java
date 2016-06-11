package GUIs;

/**
 * @author Hermawanska
 */
public class CompareToChallenge {

    public static void main(String[] args) {
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        System.out.println("applebee's".compareTo("apple"));
        System.out.print("Comparing \"bambang\" with \"bambang\" produces ");
        System.out.println("bambang".compareTo("bambang"));
        System.out.print("Comparing \"umy\" with \"ugm\" produces ");
        System.out.println("umy".compareTo("ugm"));
        System.out.print("Comparing \"abi\" with \"habibi\" produces ");
        System.out.println("abi".compareTo("habibi"));
        System.out.print("Comparing \"habibi\" with \"abi\" produces ");
        System.out.println("habibi".compareTo("abi"));
        System.out.print("Comparing \"abi\" with \"abi\" produces ");
        System.out.println("abi".compareTo("abi"));
        System.out.print("Comparing \"habibi\" with \"habibi\" produces ");
        System.out.println("habibi".compareTo("habibi"));

    }
}
