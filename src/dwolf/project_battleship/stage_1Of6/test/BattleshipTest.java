package dwolf.project_battleship.stage_1Of6.test;

import dwolf.project_battleship.stage_1Of6.Battleship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleshipTest {
	private Battleship bs;

	@BeforeEach
	void setUp() {
		bs = new Battleship();
	}

	@Test
	void renderBoard() {
		String[] lines = bs.renderBoard().split("\n");
		assertEquals(11, lines.length);
		assertEquals("  1 2 3 4 5 6 7 8 9 10", lines[0]);
		assertEquals("A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~", lines[1]);
	}
}