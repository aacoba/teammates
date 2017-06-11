package teammates.common.util;

/**
 * Created by jeroenvangelder on 11-6-17.
 */
public interface VersionControl{

    @Override
    boolean equals(Object anotherVersion);

    @Override
    int hashCode();

    @Override
    String toString();

    String toStringWithDots();

    String toStringWithDashes();
}
