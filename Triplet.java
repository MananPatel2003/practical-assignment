
class Triplet<U, V, T> {
    public final U first;
    public final V second;
    public final T third;

    private Triplet(U first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triplet t = (Triplet) o;

        if (!first.equals(t.first) ||
                !second.equals(t.second) ||
                !third.equals(t.third)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c) {
        return new Triplet<>(a, b, c);
    }
}
