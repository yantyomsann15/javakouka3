import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * ワンピースキャラクター図鑑のメインクラス。
 */
public class OnePieceBook {

    /** Scanner クラスのインスタンスを作成 */
    public static Scanner scanner = new Scanner(System.in, "Shift-JIS");

    /** 麦わらの一味のキャラクターリスト */
    GangofstrowCharacterList gangofstrowCharacterList = new GangofstrowCharacterList();

    /** その他のキャラクターリスト */
    OtherCharacterList otherCharacterList = new OtherCharacterList();

    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数。
     */
    public static void main(String[] args) {
        // インスタンスを作成
        OnePieceBook onePieceBook = new OnePieceBook();

        // ユーザーの名前を入力
        System.out.println("おれはルフィ!!! 海賊王になる男だ!!!");
        System.out.print("お前の名前を入力してくれ！: ");
        String userName = scanner.nextLine();
        System.out.println("よろしくな！" + userName + "！");

        int choice;
        while (true) {
            // メニューを表示
            showMenu();
            try {
                // ユーザーの選択を受け取る
                choice = scanner.nextInt();
                scanner.nextLine();

                // 選択に応じて処理をする
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
                            System.out.println(userName + "出航だぁ!!!");
                            scanner.close();
                            System.exit(0);
                        } else if (yesno.equalsIgnoreCase("はい")) {
                            System.out.println("行くぞ!!!!");
                            System.out.println("もう一度選択してくれ！");
                            System.out.println("");
                        } else {
                            System.out.println("ねぇぞそんなの");
                        }
                        break;
                    default:
                        System.out.println("そんな選択肢はねぇぞ？");
                        System.out.println("");
                }
            } catch (InputMismatchException e){
                // 入力が数字でない場合
                System.out.println("なんだ？それ？");
                System.out.println("");
                scanner.nextLine(); 
            }
        }
    }

    /**
     * メニューを表示するメソッド。
     */
    public static void showMenu() {
        System.out.println("ワンピースキャラクター図鑑！");
        System.out.println("1. 麦わらの一味のキャラクター一覧and詳細");
        System.out.println("2. その他のキャラクター一覧and詳細");
        System.out.println("0. 終了");
        System.out.print("どれにするんだぁ？: ");
    }
}
