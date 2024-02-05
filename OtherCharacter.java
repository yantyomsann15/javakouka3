/**
 * このクラスはその他のキャラクターを表示する
 */
public class OtherCharacter implements OtherCharacterInfo {

    /** キャラクターの名前 */
    private String name;

    /** キャラクターの役割 */
    private String role;

    /**
     * @param name キャラクターの名前
     * @param role キャラクターの役割
     */
    public OtherCharacter(String name, String role) {
        this.name = name;
        this.role = role;
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
}
