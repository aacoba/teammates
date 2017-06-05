package teammates.common.datatransfer;

private class PointDefinition        {
        private boolean isSquareArray;
        public int teamSize, firstDividerLocation, secondDividerLocation, ThirdDividerLocaion;

        public pointDefinition(boolean isSquareArray, int teamSize)
        {
                this.isSquareArray = isSquareArray;
                teamSize = teamSize;
                firstDividerLocation = teamSize - 1;
                secondDividerLocation = teamSize * 2 - 1;
                thirdDividerLocation = secondDividerLocation + 1;
        }
}