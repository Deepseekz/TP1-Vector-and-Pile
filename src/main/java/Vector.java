import java.util.Arrays;

/** * La classe Vector implémente un tableau d'entiers * de taille dynamique. Les éléments du vecteur sont stockés dans un tableau. * La taille de ce tableau est au minimum doublée à chaque fois qu'il est * nécessaire de le faire grossir. */
public class Vector {

    public Object[] getElements() {
        return elements;
    }

    /**
     * Tableau permettant de stocker les éléments du vecteur.
     * Seuls les size premiers éléments font partie du vecteur.
     * La taille de ce tableau est égale à la capacité du vecteur, c'est-à-dire,
     * au nombre d'éléments maximum que le vecteur peut contenir sans
     * avoir besoin d'allouer un nouveau tableau.
     */
    private Object[] elements;

    /**
     * Nombre d'éléments présents dans le vecteur.
     */
    private int size;

    /**
     * Construit un vecteur de capacité initiale initialCapacity.
     *
     * @param initialCapacity Capacité initiale du vecteur
     */
    public Vector(int initialCapacity) {
        elements = new Object[initialCapacity];
        size = 0;
    }

    public Vector() {
        this(10);
    }

    /**
     * Augmente la capacité du vecteur si nécessaire de façon
     * à permettre le stockage d'au moins <code>minCapacity</code>
     * éléments. S'il est nécessaire d'augmenter la capacité du vecteur,
     * elle est au minimum doublée.
     *
     * @param minCapacity Capacité minimale à assurer
     */
    public void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= minCapacity)
            return;
        int newCapacity = Math.max(oldCapacity * 2, minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void resize(int newSize) {
        ensureCapacity(newSize);
        resetValuesInRange(newSize, size);
        this.size = newSize;
    }

    public void resetValuesInRange (int startIndex, int endIndexExcluded) {
        for (int k = startIndex ; k < endIndexExcluded; k++) {
            this.elements [k] = null;
        }
    }

    /**
     * Retourne la capacité du vecteur.
     *
     * @return Capacité du vecteur.
     */
    public int capacity()
    {
        return elements.length;
    }

    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return this.elements[0] == null;
    }

    public void add(Object element)
    {
        if (this.size + 1 > this.elements.length)
            ensureCapacity(this.size + 1);

        this.elements[this.size] = element;
        size += 1;
    }
    public void set(int index, Object element)
    {
        this.elements[index] = element;
    }
    public Object get(int index)
    {
        return this.elements[index];
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}