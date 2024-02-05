/**
 * その他のキャラクターの一覧と詳細を表示するクラス
 */
public class OtherCharacterList extends CharacterList {

    /**
     * その他のキャラクターの詳細を表示するメソッド
     */
    public void showOtherCharacterDetails() {

        OtherCharacter ace = new OtherCharacter("ポートガス・D・エース", "白ひげ海賊団2番艦長");
        OtherCharacter row = new OtherCharacter("トラファルガー・ロー", "ハートの海賊団船長");
        OtherCharacter shanks = new OtherCharacter("シャンクス", "赤髪海賊団の船長");
        OtherCharacter sabo = new OtherCharacter("サボ", "革命軍の幹部");
        OtherCharacter hancock = new OtherCharacter("ボア・ハンコック", "アマゾン・リリー国の女王");
        OtherCharacter teach = new OtherCharacter("マーシャル・D・ティーチ", "海の四皇");
        OtherCharacter mihawk = new OtherCharacter("ジュラキュール・ミホーク", "世界最強の剣士");
        OtherCharacter whitebeard = new OtherCharacter("エドワード・ニューゲート（白ひげ）", "白ひげ海賊団の船長");
        OtherCharacter aokiji = new OtherCharacter("青キジ", "元海軍大将");
        OtherCharacter kizaru = new OtherCharacter("黄猿", "海軍大将");
        OtherCharacter fujitora = new OtherCharacter("藤虎", "海軍大将");
        OtherCharacter ryokugyu = new OtherCharacter("緑牛", "海軍大将");
        OtherCharacter sengoku = new OtherCharacter("センゴク", "元海軍元帥");
        OtherCharacter garp = new OtherCharacter("モンキー・D・ガープ", "海軍中将");
        OtherCharacter tsuru = new OtherCharacter("つる", "海軍中将");
        OtherCharacter crocodile = new OtherCharacter("サー・クロコダイル", "元七武海");
        OtherCharacter kuma = new OtherCharacter("バーソロミュー・くま", "元七武海");
        OtherCharacter weevil = new OtherCharacter("エドワード・ウィーブル", "王下七武海");
        OtherCharacter kaido = new OtherCharacter("カイドウ", "四皇");
        OtherCharacter bigmom = new OtherCharacter("ビッグマム", "四皇");
        OtherCharacter dragon = new OtherCharacter("モンキー・D・ドラゴン", "革命軍総司令");
        // キャラクターの一覧詳細表示
        System.out.println("キャラクター一覧詳細:");

        // エースの情報を表示
        System.out.println("名前: " + ace.getName());
        System.out.println("役職: " + ace.getRole());
        System.out.println();

        // ローの情報を表示
        System.out.println("名前: " + row.getName());
        System.out.println("役職: " + row.getRole());
        System.out.println();

        // シャンクスの情報を表示
        System.out.println("名前: " + shanks.getName());
        System.out.println("役職: " + shanks.getRole());
        System.out.println();

        // サボの情報を表示
        System.out.println("名前: " + sabo.getName());
        System.out.println("役職: " + sabo.getRole());
        System.out.println();

        // ハンコックの情報を表示
        System.out.println("名前: " + hancock.getName());
        System.out.println("役職: " + hancock.getRole());
        System.out.println();

        // ティーチの情報を表示
        System.out.println("名前: " + teach.getName());
        System.out.println("役職: " + teach.getRole());
        System.out.println();

        // ミホークの情報を表示
        System.out.println("名前: " + mihawk.getName());
        System.out.println("役職: " + mihawk.getRole());
        System.out.println();

        // 白ひげの情報を表示
        System.out.println("名前: " + whitebeard.getName());
        System.out.println("役職: " + whitebeard.getRole());
        System.out.println();

        // クザン(青キジ)の情報を表示
        System.out.println("名前: " + aokiji.getName());
        System.out.println("役職: " + aokiji.getRole());
        System.out.println();

        // ボルサリーノ(黄猿)の情報を表示
        System.out.println("名前: " + kizaru.getName());
        System.out.println("役職: " + kizaru.getRole());
        System.out.println();

        // 藤虎の情報を表示
        System.out.println("名前: " + fujitora.getName());
        System.out.println("役職: " + fujitora.getRole());
        System.out.println();

        // 緑牛の情報を表示
        System.out.println("名前: " + ryokugyu.getName());
        System.out.println("役職: " + ryokugyu.getRole());
        System.out.println();

        // センゴクの情報を表示
        System.out.println("名前: " + sengoku.getName());
        System.out.println("役職: " + sengoku.getRole());
        System.out.println();

        // ガープの情報を表示
        System.out.println("名前: " + garp.getName());
        System.out.println("役職: " + garp.getRole());
        System.out.println();

        // 鶴の情報を表示
        System.out.println("名前: " + tsuru.getName());
        System.out.println("役職: " + tsuru.getRole());
        System.out.println();

        // クロコダイルの情報を表示
        System.out.println("名前: " + crocodile.getName());
        System.out.println("役職: " + crocodile.getRole());
        System.out.println();

        // くまの情報を表示
        System.out.println("名前: " + kuma.getName());
        System.out.println("役職: " + kuma.getRole());
        System.out.println();

        // ウィーブルの情報を表示
        System.out.println("名前: " + weevil.getName());
        System.out.println("役職: " + weevil.getRole());
        System.out.println();

        // カイドウの情報を表示
        System.out.println("名前: " + kaido.getName());
        System.out.println("役職: " + kaido.getRole());
        System.out.println();

        // ビッグマムの情報を表示
        System.out.println("名前: " + bigmom.getName());
        System.out.println("役職: " + bigmom.getRole());
        System.out.println();

        // ドラゴンの情報を表示
        System.out.println("名前: " + dragon.getName());
        System.out.println("役職: " + dragon.getRole());
    }
}
