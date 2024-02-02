public class OtherCharacterList extends CharacterList {
    public void showOtherCharacterDetails() {
        OtherCharacter ace = new OtherCharacter("ポートガス・D・エース", "白ひげ海賊団2番艦長");
        OtherCharacter row = new OtherCharacter("トラファルガー・ロー", "ハートの海賊団船長");
        OtherCharacter shanks = new OtherCharacter("シャンクス", "赤髪海賊団の船長");
        OtherCharacter sabo = new OtherCharacter("サボ", "革命軍の幹部");
        OtherCharacter hancock = new OtherCharacter("ボア・ハンコック", "アマゾン・リリー国の女王");
        OtherCharacter teach = new OtherCharacter("マーシャル・D・ティーチ", "海の四皇");
        OtherCharacter mihawk = new OtherCharacter("ジュラキュール・ミホーク", "世界最強の剣士");
        OtherCharacter whitebeard = new OtherCharacter("エドワード・ニューゲート（白ひげ）", "白ひげ海賊団の船長");

        // キャラクターの一覧詳細表示
        System.out.println("キャラクター一覧詳細:");

        // Aceの情報を表示
        System.out.println("名前: " + ace.getName());
        System.out.println("役職: " + ace.getRole());
        System.out.println();

        // Rowの情報を表示
        System.out.println("名前: " + row.getName());
        System.out.println("役職: " + row.getRole());
        System.out.println();

        // Shanksの情報を表示
        System.out.println("名前: " + shanks.getName());
        System.out.println("役職: " + shanks.getRole());
        System.out.println();

        // Saboの情報を表示
        System.out.println("名前: " + sabo.getName());
        System.out.println("役職: " + sabo.getRole());
        System.out.println();

        // Hancockの情報を表示
        System.out.println("名前: " + hancock.getName());
        System.out.println("役職: " + hancock.getRole());
        System.out.println();

        // Teachの情報を表示
        System.out.println("名前: " + teach.getName());
        System.out.println("役職: " + teach.getRole());
        System.out.println();

        // Mihawkの情報を表示
        System.out.println("名前: " + mihawk.getName());
        System.out.println("役職: " + mihawk.getRole());
        System.out.println();

        // Whitebeardの情報を表示
        System.out.println("名前: " + whitebeard.getName());
        System.out.println("役職: " + whitebeard.getRole());
    }
}
