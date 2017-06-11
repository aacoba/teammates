package teammates.common.datatransfer;

public class PointDefinition        {
        private boolean isSquareArray;
        public int teamSize, firstDividerLocation, secondDividerLocation, thirdDividerLocation;

        public PointDefinition(boolean isSquareArray, int teamSize)
        {
                this.isSquareArray = isSquareArray;
                this.teamSize = teamSize;
                firstDividerLocation = teamSize - 1;
                secondDividerLocation = teamSize * 2 - 1;
                thirdDividerLocation = secondDividerLocation + 1;
        }

        public boolean getIsSquareArray()
        {
                return isSquareArray;
        }
}