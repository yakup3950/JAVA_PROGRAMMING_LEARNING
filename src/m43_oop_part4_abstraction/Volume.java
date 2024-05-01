package m43_oop_part4_abstraction;

public interface Volume {

    boolean HAS_VOLUME = false;//these are default for variables - (public static final) under interfaces.

    double volume(); // without {} these are default - (public abstract) in this method.

}
