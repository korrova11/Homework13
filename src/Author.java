import java.util.Objects;

public class Author {
    private   String fullName;

    public   Author (String fullName) {
        this.fullName = fullName;

    }
    public String getFullName() {

        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()|| other == null)
            return false;

        if (this == other ) return true;
        Author f2 = (Author) other;
     return fullName.equals(f2.fullName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getFullName());
    }

    @Override
    public String toString() {
        return "Замечательный писатель - "+getFullName();
    }

}
