import java.util.Scanner;

public class OnePieceBook {

    public static Scanner scanner = new Scanner(System.in, "Shift-JIS");
    GangofstrowCharacterList gangofstrowCharacterList = new GangofstrowCharacterList();
    OtherCharacterList otherCharacterList = new OtherCharacterList();

    public static void main(String[] args) {
        OnePieceBook onePieceBook = new OnePieceBook(); // インスタンスを作成

        System.out.println("おれはルフィ!!! 海賊王になる男だ!!!");
        System.out.print("お前の名前を入力してくれ！: ");
        String userName = scanner.nextLine();

        System.out.println("よろしくな！" + userName + "！");

        int choice;
        while (true) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    onePieceBook.gangofstrowCharacterList.showGangofstrowCharacterDetails(); 
                    System.out.println("");
                    break;
                case 2:
                    onePieceBook.otherCharacterList.showOtherCharacterDetails(); 
                    System.out.println("");
                    break;
                case 0:
                    System.out.print("「生きたい」と言えェ!!!! (はい/いいえ): ");
                    String yesno = scanner.nextLine();

                    if (yesno.equalsIgnoreCase("いいえ")) {
                        System.out.println("お前とはもう…やっていけねェ 最後まで迷惑かけたな" + userName);
                        scanner.close();
                        System.exit(0);
                    } else if (yesno.equalsIgnoreCase("はい")) {
                        System.out.println("行くぞ!!!!");
                        System.out.println("もう一度選択してくれ！");
                        System.out.println("");
                    } else {
                        System.out.println("無効な選択です。");
                    }
                    break;
                default:
                    System.out.println("そんな選択肢はねぇぞ？");
            }
        }
    }

    public static void showMenu() {
        System.out.println("ワンピースキャラクター図鑑！");
        System.out.println("1. 麦わらの一味のキャラクター一覧or詳細");
        System.out.println("2. その他のキャラクター一覧or詳細");
        System.out.println("0. 終了");
        System.out.print("どれにするんだぁ？: ");
    }
}
