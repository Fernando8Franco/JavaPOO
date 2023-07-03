package javapooext03;

public class Roots {
    private float a;
    private float b;
    private float c;

    public Roots(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public boolean hasRoots() {
        return getDiscriminant() >= 0 ? true : false;
    }

    public boolean hasRoot() {
        return getDiscriminant() == 0 ? true : false;
    }

    public void obtainRoots() {
        double ans1;
        double ans2;
        if (hasRoots()) {
            ans1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
            ans2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);

            System.out.println("Las posibles soluciones son: " + ans1 + " " + ans2);
        }
    }

    public void obtainRoot() {
        double ans;
        if (hasRoot()) {
            ans = -b / (2 * a);

            System.out.println("La solución es: " + ans);
        }
    }

    public void calculate() {
        if (hasRoot())
            obtainRoot();
        else
            obtainRoots();
    }
}
