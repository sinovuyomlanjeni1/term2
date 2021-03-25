package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    Enemy enemy1, enemy2;

    @BeforeEach
    void setUp() {
        enemy1 = new Enemy();
        enemy2 = new Enemy();
    }

    @Test
    void testEquality() {
        assertEquals(enemy1, enemy2);
    }

    @Test
    void testIdentity() {
        assertSame(enemy1, enemy2);
    }

    @Test
    void testFail() {
        fail("I'm destined to fail");
    }

    @Test
    @Timeout(1)
    void passTimeout() {
        enemy1.Attack();
    }

    @Test
    @Timeout(1)
    void failTimeout() throws InterruptedException {
        enemy1.Block();
    }

    @Test
    @Disabled
    void skippedTest() {
        fail("I should fail, right?");
    }
}