public class CharacterList {
    // 麦わらの一味のキャラクターリスト
    GangofstrowCharacterList gangofstrowCharacterList;
    // その他のキャラクターリスト
    OtherCharacterList otherCharacterList;

    // 麦わらの一味のキャラクター詳細を表示するメソッド
    public void showGangofstrowCharacterDetails() {
        gangofstrowCharacterList.showGangofstrowCharacterDetails();
    }

    // その他のキャラクターの詳細を表示するメソッド
    public void showOtherCharacterDetails() {
        otherCharacterList.showOtherCharacterDetails();
    }

    // 麦わらの一味のそのキャラクターの詳細を表示するメソッド
    public void gangofstrowcharacterDetails(String characterName) {
        gangofstrowCharacterList.gangofstrowcharacterDetails(characterName);
    }

    // その他のキャラクターのそのキャラクターの詳細を表示するメソッド
    public void otherCharacterDetails(String name) {
        otherCharacterList.otherCharacterDetails(name);
    }
}
