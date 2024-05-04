class BattleContext {
    private GameStatus currentState;

    public BattleContext() {
        this.currentState = GameStatus.IN_PROGRESS;
    }

    public void setState(GameStatus state) {
        this.currentState = state;
    }

    public void handle(BattleMain battleMain) {
        if (currentState == GameStatus.IN_PROGRESS) {
            battleMain.startBattle();
            currentState = GameStatus.FINISHED;
        }
    }
}