package teammates.common.util;

/**
 * Created by jeroenvangelder on 11-6-17.
 */
public class FakeRemoteVersion implements VersionControl, Comparable<FakeRemoteVersion> {

    /* ===============================================
    Calling remote service failed, not implemented yet
    ================================================*/

    private String FakeRemoteVersionRepresentation;

    public FakeRemoteVersion(String versionInString)
    {
        this.FakeRemoteVersionRepresentation = "Calling remote service failed, not implemented yet";
    }

    @Override
    public boolean equals(Object anotherVersion)
    {
        return false;
    }

    @Override
    public int hashCode(){ return 404; }

    @Override
    public int compareTo(FakeRemoteVersion o) {
        return 0;
    }

    @Override
    public String toStringWithDots() {
        return "Calling remote service failed, not implemented yet";
    }

    @Override
    public String toStringWithDashes() {
        return "Calling remote service failed, not implemented yet";
    }
}
