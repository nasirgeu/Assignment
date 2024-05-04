class Audience implements GameObserver {
    private final String playerAName;
    private final String playerBName;
    private boolean isPlayerATurn = true;

    public Audience(String playerAName, String playerBName) {
        this.playerAName = playerAName;
        this.playerBName = playerBName;
    }

    @Override
    public void update(TeamMember attacker, TeamMember defender, int damage) {
        String attackerName = isPlayerATurn ? playerAName : playerBName;
        String defenderName = isPlayerATurn ? playerBName : playerAName;

        System.out.println("Audience(" + attackerName + "): Attacker health: " + (attacker == null ? 0 : attacker.getHealth()) +
                ", Defender health: " + (defender == null ? 0 : defender.getHealth()) +
                ", Damage dealt: " + damage);

        assert defender != null;
        if(defender.getHealth() <= 0)
            System.out.println(defenderName + " emerges victorious!");

        isPlayerATurn = !isPlayerATurn;
    }
}