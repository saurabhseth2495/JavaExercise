import java.util.List;

class SingletonClassForBlockBuster {
    private static List<BlockBuster> blockBusterList;
    private static SingletonClassForBlockBuster singletonClassForBlockBuster;

    private SingletonClassForBlockBuster(List<BlockBuster> blockBusterList) {
        this.blockBusterList = blockBusterList;
    }

    public static SingletonClassForBlockBuster getSingletonClassForBlockBusterInstance(List<BlockBuster> blockBusterList) {
        if (singletonClassForBlockBuster == null) {
            singletonClassForBlockBuster = new SingletonClassForBlockBuster(blockBusterList);
        }
        return singletonClassForBlockBuster;
    }

    public List<BlockBuster> getBlockBusterList() {
        return blockBusterList;
    }
}
