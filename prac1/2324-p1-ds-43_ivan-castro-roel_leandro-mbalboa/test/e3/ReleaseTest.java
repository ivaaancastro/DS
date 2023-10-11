package e3;

import ej3.Release;
import ej3.Track;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseTest {

    /* Releases. */
    private static Release beatlesSFFPennyLane; // Original double A-Side.
    private static Release beatlesPennyLanePromo; // Promotional release.
    private static Release beatlesSFFDigital; // One-track digital version.

    private static Release madonnaAngelUKSingle;
    private static Release madonnaAngelUKMaxiSingle;
    private static Release madonnaAngelUSMaxiSingle;
    private static Release madonnaIntoTheGrooveUSMaxiSingle;
    private static Release drake;

    @BeforeAll
    static void setUp() {
        /* Recordings. */
        String recBeatlesSFF = "6f5f27e2-fe6d-4c98-be0b-1e58d569909c";
        String recBeatlesPennyLane = "5a6becfb-07e3-4286-8de0-5b4fa826f3f2";

        // Angel (short radio version).
        String recMadonnaAngelSingleEdit = "99f49645-1811-42f7-8a14-0df8578ccf09";
        // Angel (extended dance version), different recording.
        String recMadonnaAngelExtendedMix = "74e2ab8f-56f2-4b9c-ad35-336c73cd73e0";
        String recMadonnaBurningUp = "ed102d77-146c-4941-85c6-07f3b9df7117";
        String recMadonnaIntoTheGroove = "986645ce-32d0-42ba-999a-7faf2603aa7e";


        /* Releases. */

        //Drake
        drake = new Release("12345");
        drake.addTrack(new Track("A", "076645ce-99d0-42ba-000y-7faf2603aa7", "Drake", "God's Plan", 250));


        // https://musicbrainz.org/release/eadb40cc-9394-3787-80c3-644ed4a167c0
        beatlesSFFPennyLane = new Release("eadb40cc-9394-3787-80c3-644ed4a167c0");
        beatlesSFFPennyLane.setArtist("Beatles");
        beatlesSFFPennyLane.setTitle("Strawberry Fields Forever / Penny Lane");
        beatlesSFFPennyLane.addTrack(new Track("A", recBeatlesSFF, "The Beatles", "Strawberry Fields Forever", 251));
        beatlesSFFPennyLane.addTrack(new Track("AA", recBeatlesPennyLane, "The Beatles", "Penny Lane", 178));

        // https://musicbrainz.org/release/0173d355-016f-4d28-8c57-cdb0b6fd30a0
        beatlesPennyLanePromo = new Release("0173d355-016f-4d28-8c57-cdb0b6fd30a0");
        beatlesPennyLanePromo.setArtist("The Beatles");
        beatlesPennyLanePromo.setTitle("Penny Lane / Strawberry Fields Forever (Promo)");
        beatlesPennyLanePromo.addTrack(new Track("A", recBeatlesPennyLane, "Beatles", "Penny Lane", 180));
        beatlesPennyLanePromo.addTrack(new Track("B", recBeatlesSFF, "Beatles", "Strawberry Fields Forever", 245));

        // https://musicbrainz.org/release/af20e7d5-8ab2-4967-8608-c508213b821d
        beatlesSFFDigital = new Release("af20e7d5-8ab2-4967-8608-c508213b821d");
        beatlesSFFDigital.setArtist("The Beatles");
        beatlesSFFDigital.setTitle("Strawberry Fields Forever (Single)");
        beatlesSFFDigital.addTrack(new Track("1", recBeatlesSFF, "The Beatles", "Strawberry Fields Forever (Remastered 2009)", 238));

        // https://musicbrainz.org/release/fcd7fed3-4523-49bc-a310-129a1f3b6bcc
        madonnaAngelUKSingle = new Release("fcd7fed3-4523-49bc-a310-129a1f3b6bcc");
        madonnaAngelUKSingle.setArtist("Madonna");
        madonnaAngelUKSingle.setTitle("Angel (UK 7\" Single)");
        madonnaAngelUKSingle.addTrack(new Track("A1", recMadonnaAngelSingleEdit, "Madonna", "Angel (Edit)", 222));
        madonnaAngelUKSingle.addTrack(new Track("B1", recMadonnaBurningUp, "Madonna", "Burning Up", 288));

        // https://musicbrainz.org/release/56f72e41-1060-4926-b77d-58d7b2a4df86
        madonnaAngelUKMaxiSingle = new Release("56f72e41-1060-4926-b77d-58d7b2a4df86");
        madonnaAngelUKMaxiSingle.setArtist("Madonna");
        madonnaAngelUKMaxiSingle.setTitle("Angel (UK 12\" Single)");
        madonnaAngelUKMaxiSingle.addTrack(new Track("A1", recMadonnaAngelExtendedMix, "Madonna", "Angel (Extended Dance Mix)", 375));
        madonnaAngelUKMaxiSingle.addTrack(new Track("B1", recMadonnaBurningUp, "Madonna", "Burning Up", 288));

        // https://musicbrainz.org/release/8b53c32c-ee79-42b1-a7a9-bd7c63322c31
        madonnaAngelUSMaxiSingle = new Release("8b53c32c-ee79-42b1-a7a9-bd7c63322c31");
        madonnaAngelUSMaxiSingle.setArtist("Madonna");
        madonnaAngelUSMaxiSingle.setTitle("Angel (US 12\" Single)");
        madonnaAngelUSMaxiSingle.addTrack(new Track("A1", recMadonnaAngelExtendedMix, "Madonna", "Angel (Extended Dance Mix)", 375));
        madonnaAngelUSMaxiSingle.addTrack(new Track("B1", recMadonnaIntoTheGroove, "Madonna", "Into The Groove", 280));

        // https://musicbrainz.org/release/d0e62810-fcab-443e-b3ef-398db6cec5eb
        madonnaIntoTheGrooveUSMaxiSingle = new Release("d0e62810-fcab-443e-b3ef-398db6cec5eb");
        madonnaIntoTheGrooveUSMaxiSingle.setArtist("Madonna");
        madonnaIntoTheGrooveUSMaxiSingle.setTitle("Into the Groove (US 12\" Single)");
        madonnaIntoTheGrooveUSMaxiSingle.addTrack(new Track("A1", recMadonnaIntoTheGroove, "Madonna", "Into the Groove", 280));
        madonnaIntoTheGrooveUSMaxiSingle.addTrack(new Track("B1", recMadonnaAngelExtendedMix, "Madonna", "Angel (12\" Dance Mix)", 375));

    }

    // Test para hashcode
    @Test
    void testHashCode() {
        assertEquals(beatlesSFFPennyLane.hashCode(), beatlesPennyLanePromo.hashCode()); // Same but with flipped sides.
        assertEquals(madonnaAngelUSMaxiSingle.hashCode(), madonnaIntoTheGrooveUSMaxiSingle.hashCode()); // Same but with flipped sides.
    }

    // Tests para equals
    @Test
    void testEquals() {
        assertEquals(beatlesSFFPennyLane, beatlesPennyLanePromo); // Same but with flipped sides.
        assertEquals(madonnaAngelUSMaxiSingle, madonnaIntoTheGrooveUSMaxiSingle); // Same but with flipped sides.
    }

    @Test
    void testNotEquals() {
        assertNotEquals(beatlesSFFPennyLane, beatlesSFFDigital); // Different number of songs.
        assertNotEquals(madonnaAngelUKMaxiSingle, madonnaAngelUSMaxiSingle); // Different songs.
        assertNotEquals(madonnaAngelUKSingle, madonnaAngelUSMaxiSingle); // Same songs but different versions.
    }

    @Test
    void testEqualsSameObject() {
        assertEquals(beatlesSFFPennyLane, beatlesSFFPennyLane);
    }

    @Test
    void testNotEqualsNull() {
        assertNotEquals(beatlesSFFPennyLane, null);
    }

    @Test
    void testEqualsEmptyTrackLists() {
        Release release1 = new Release("41f72e41-5418-9635-b77d-45haa2a4df86");
        Release release2 = new Release("89j52e41-4789-5612-a44h-89d7b2a4df45");
        assertEquals(release1, release2);
    }

    @Test
    void testNotEqualsDifferentEmptyTrackLists() {
        Release release1 = new Release("299106ec-4272-4b57-9f75-06975dc2b72b");
        Release release2 = new Release("c0dad6be-2ebd-4115-8831-c32b682e0bd7");
        release2.addTrack(new Track("A", "081aac26-f121-4e58-b1e4-797cf373d29f", "Artist", "Song", 180));
        assertNotEquals(release1, release2);
    }


    // Test toString
    @Test
    void testToString() {
        String expectedToString = "ID: d0e62810-fcab-443e-b3ef-398db6cec5eb\n" +
                "Título: Into the Groove (US 12\" Single)\n" +
                "Artista: Madonna\n" +
                "Pistas:\n" +
                " - Pista A1-> ID Grabación: 986645ce-32d0-42ba-999a-7faf2603aa7e, Artista: Madonna, Título: Into the Groove, Duración: 280 min\n" +
                " - Pista B1-> ID Grabación: 74e2ab8f-56f2-4b9c-ad35-336c73cd73e0, Artista: Madonna, Título: Angel (12\" Dance Mix), Duración: 375 min\n";

        assertEquals(expectedToString, madonnaIntoTheGrooveUSMaxiSingle.toString());
    }


    // Tests para Getters and Setters
    @Test
    void testSetIdentificador() {
        Release release = new Release("12345");
        release.setIdentificador("54321");
        assertEquals("54321", release.getIdentificador());
    }

    @Test
    void testSetTitle() {
        Release release = new Release("12345");
        release.setTitle("Mi Nuevo Título");
        assertEquals("Mi Nuevo Título", release.getTitle());
    }

    @Test
    void testSetArtist() {
        Release release = new Release("12345");
        release.setArtist("Mi Nuevo Artista");
        assertEquals("Mi Nuevo Artista", release.getArtista());
    }

    @Test
    void testGetIdentificador() {
        assertEquals("8b53c32c-ee79-42b1-a7a9-bd7c63322c31", madonnaAngelUSMaxiSingle.getIdentificador());
    }

    @Test
    void testGetArtista() {
        assertEquals("Madonna", madonnaAngelUSMaxiSingle.getArtista());
    }

    @Test
    void testGetTitle() {
        assertEquals("Angel (US 12\" Single)", madonnaAngelUSMaxiSingle.getTitle());
    }

    @Test
    void testGetTracks() {
        assertEquals("[Posición: A1\n" +
                "ID Grabación: 74e2ab8f-56f2-4b9c-ad35-336c73cd73e0\n" +
                "Artista: Madonna\n" +
                "Título: Angel (Extended Dance Mix)\n" +
                "Duración: 375\n" +
                ", Posición: B1\n" +
                "ID Grabación: 986645ce-32d0-42ba-999a-7faf2603aa7e\n" +
                "Artista: Madonna\n" +
                "Título: Into The Groove\n" +
                "Duración: 280\n" +
                "]", madonnaAngelUSMaxiSingle.getTracks().toString());
    }


    //Tests para el lanzamiento de excepciones
    @Test
    void testSetIdentificadorWithNull() {
        Release release = new Release("433e6d12-748e-4eb7-bc1f-466e9c9b4a5a");
        assertThrows(NullPointerException.class, () -> release.setIdentificador(null));
    }

    @Test
    void testSetTitleWithEmptyString() {
        Release release = new Release("67444a4a-5b2c-45e0-8141-2b133e46823c");
        assertThrows(IllegalArgumentException.class, () -> release.setTitle(""));
    }

    @Test
    void testSetArtistWithEmptyString() {
        Release release = new Release("851ce730-35a6-4072-b674-74fa7c273a10");
        assertThrows(IllegalArgumentException.class, () -> release.setArtist(""));
    }

    @Test
    void testAddNullTrack() {
        Release release = new Release("a0fd3416-52b7-44a2-8877-3a5cd4e6f95a");
        assertThrows(NullPointerException.class, () -> release.addTrack(null));
    }
}
