// キャラクターが見つからない場合の例外クラス
class CharacterNotFoundException extends Exception {
    public CharacterNotFoundException(String no) {
        super(no);
    }
}