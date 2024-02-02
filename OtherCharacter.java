// インターフェースを実装
public class OtherCharacter implements OtherCharacterInfo {
    // その他のキャラの詳細
    public String name;
    public String role;

    // コンストラクタ
    public OtherCharacter(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // その他のキャラのインターフェースのメソッドをオーバーライド

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }
}
