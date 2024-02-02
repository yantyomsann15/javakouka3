public class GangofstrowCharacterList extends CharacterList {
    public void showGangofstrowCharacterDetails() {
        GangofstrowCharacter luffy = new GangofstrowCharacter("モンキー・D・ルフィ", "船長", "海賊王になる、？？？");
        GangofstrowCharacter zoro = new GangofstrowCharacter("ロロノア・ゾロ", "剣士", "世界一の大剣豪になる");
        GangofstrowCharacter nami = new GangofstrowCharacter("ナミ", "航海士", "自分の目で見た世界地図をつくる");
        GangofstrowCharacter usopp = new GangofstrowCharacter("ウソップ", "狙撃手", "勇敢な海の戦士になる");
        GangofstrowCharacter sanji = new GangofstrowCharacter("サンジ", "料理人", "オールブル－を発見する");
        GangofstrowCharacter chopper = new GangofstrowCharacter("トニートニー・チョッパー", "船医", "万能薬になる");
        GangofstrowCharacter robin = new GangofstrowCharacter("ニコ・ロビン", "考古学者", "真の歴史を解読する");
        GangofstrowCharacter franky = new GangofstrowCharacter("フランキー", "船大工", "夢の船を作り、その船が世界の果てに到達するのを見届ける");
        GangofstrowCharacter brook = new GangofstrowCharacter("ブルック", "音楽家", "ラブーンとの再会");
        GangofstrowCharacter jinbei = new GangofstrowCharacter("ジンベエ", "操舵手", "魚人と人間の和解");

        // キャラクターの一覧詳細表示
        System.out.println("麦わらの一味キャラクター一覧詳細:");

        // Luffyの情報を表示
        System.out.println("名前: " + luffy.getName());
        System.out.println("職業: " + luffy.getRole());
        System.out.println("夢: " + luffy.getDream());
        System.out.println();

        // Zoroの情報を表示
        System.out.println("名前: " + zoro.getName());
        System.out.println("職業: " + zoro.getRole());
        System.out.println("夢: " + zoro.getDream());
        System.out.println();

        // Namiの情報を表示
        System.out.println("名前: " + nami.getName());
        System.out.println("職業: " + nami.getRole());
        System.out.println("夢: " + nami.getDream());
        System.out.println();

        // 他のキャラクターの情報も同様に表示
    }
}
