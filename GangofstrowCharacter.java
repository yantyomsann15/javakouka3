/**
 * このクラスは麦わらの一味のメンバーを表示する
 */
public class GangofstrowCharacter implements GangofstrowCharacterInfo {

    /** キャラクターの名前 */
    private String name;

    /** キャラクターの役割 */
    private String role;

    /** キャラクターの夢 */
    private String dream;

    /**
     * @param name  キャラクターの名前
     * @param role  キャラクターの役割
     * @param dream キャラクターの夢
     */
    public GangofstrowCharacter(String name, String role, String dream) {
        this.name = name;
        this.role = role;
        this.dream = dream;
    }

    /**
     * キャラクターの名前を取得
     *
     * @return キャラクターの名前
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * キャラクターの役割を取得
     *
     * @return キャラクターの役割
     */
    @Override
    public String getRole() {
        return role;
    }

    /**
     * キャラクターの夢を取得
     *
     * @return キャラクターの夢
     */
    @Override
    public String getDream() {
        return dream;
    }
}
