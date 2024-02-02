public class CharacterList {
    GangofstrowCharacterList gangofstrowCharacterList;
    OtherCharacterList otherCharacterList;

    // public CharacterList() {
    //     gangofstrowCharacterList = new GangofstrowCharacterList();
    //     otherCharacterList = new OtherCharacterList();
    // }

    public void showGangofstrowCharacterDetails() {
        gangofstrowCharacterList.showGangofstrowCharacterDetails();
    }

    public void showOtherCharacterDetails() {
        otherCharacterList.showOtherCharacterDetails();
    }

    public void gangofstrowcharacterDetails(String characterName) {
        gangofstrowCharacterList.gangofstrowcharacterDetails(characterName);
    }

    public void otherCharacterDetails(String name) {
        otherCharacterList.otherCharacterDetails(name);
        }
    }