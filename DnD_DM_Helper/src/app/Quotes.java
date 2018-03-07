package app;

public class Quotes {
	public static String quote() {
		int c = 1 + (int) (Math.random() * ((15 - 1) + 1));

		switch (c) {
		case 1:
			return "\"I try to seduce the lock\"";
		case 2:
			return "\"Technically, throwing my bow is just as effective as shooting\"";
		case 3:
			return "\"He is crippled and screaming in agony so no you can't use diplomacy now\"";
		case 4:
			return "\"Your Stealth is so good you disappear from this plane of existence\"";
		case 5:
			return "\"...it dies of stress from too much criticism\"";
		case 6:
			return "\"We aren't leprechauns, please don't sell us\"";
		case 7:
			return "\"I'm fairly certain i can sthealthily blow up the docks\"";
		case 8:
			return "\"You can't set water on fire just because you rolled a critical\"";
		case 9:
			return "\"I summon a pony to distract the dragon\"";
		case 10:
			return "\"Roll for 360 no-scope\"";
		case 11:
			return "\"Never question my loyalty. You will never know what I endure for it.\"";
		case 12:
			return "\"Would you say the giant looks french?\"";
		case 13:
			return "\"I tumble down the stairs to express my disapproval\"";
		case 14:
			return "\"They call me a comet. They call me a dragon. They have no words for my true form.\"";
		case 15:
			return "\"I have seen the light too clearly to ever fear the darkness.\"";
		default:
			return "";
		}
	}
}
