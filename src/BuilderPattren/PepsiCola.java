package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: Pesp
 * @Date: Created in 9:46 2018/1/9
 */
public class PepsiCola extends Drink{
    @Override
    public float price() {
        return 6.0f;
    }

    @Override
    public String name() {
        return "PepsiCola";
    }
}
