package lang.object.Immutable.address;

public class ImmutableAddress {
    private final String value; //final 불변객체 선언

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

/*    public void setValue(String value) {
        this.value = value;
    }*/ //final이 아니라도 setter를 제거하면 불변객체로 볼 수 있다

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
