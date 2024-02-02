// インターフェ－スを実装する
public class GangofstrowCharacter implements GangofstrowCharacterInfo {
    // 麦わらの一味の詳細
    public String name;
    public String role;
    public String dream;

    // コンストラクタ
    public GangofstrowCharacter(String name, String role, String dream) {
        this.name = name;
        this.role = role;
        this.dream = dream;
    }

    // 麦わらの一味のインターフェースのメソッドをオーバーライド

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String getDream() {
        return dream;
    }
}
