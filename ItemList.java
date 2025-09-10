import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ItemList {

    /** Summary:
     * This part contains the records of all Items and their associated categories
     */

    public static final Set<String> boots = new HashSet<>(Arrays.asList(
            "BERSERKER'S GREAVES", "BOOTS OF SWIFTNESS", "IONIAN BOOTS OF LUCIDITY",
            "MERCURY'S TREADS", "PLATED STEELCAPS", "SORCERER'S SHOES",
            "SLIGHTLY MAGICAL BOOTS", "BOOTS"
    ));

    public static final Set<String> armorPhysical = new HashSet<>(Arrays.asList(
            "CLOTH ARMOR", "CHAIN VEST", "WARDEN'S MAIL", "BRAMBLE VEST", "GLACIAL BUCKLER",
            "DEAD MAN'S PLATE", "FROZEN HEART", "RANDUIN'S OMEN", "THORNMAIL",
            "GARGOYLE STONEPLATE", "ICEBORN GAUNTLET", "SUNFIRE AEGIS", "GUARDIAN ANGEL",
            "ZEKE'S CONVERGENCE", "KNIGHT'S VOW", "DEATH'S DANCE", "JAK'SHO, THE PROTEAN",
            "UNENDING DESPAIR", "SHIELD OF THE RAKKOR"

    ));

    public static final Set<String> armorMagic = new HashSet<>(Arrays.asList(
            "NULL-MAGIC MANTLE", "NEGATRON CLOAK", "SPECTRE'S COWL", "FORCE OF NATURE",
            "SPIRIT VISAGE", "KAENIC ROOKERN", "ABYSSAL MASK", "BANSHEE'S VEIL",
            "MAW OF MALMORTIUS", "WIT'S END", "MERCURIAL SCIMITAR", "JAK'SHO, THE PROTEAN"

    ));

    public static final Set<String> weaponsAD = new HashSet<>(Arrays.asList(
            "INFINITY EDGE", "NAVORI FLICKERBLADE", "KRAKEN SLAYER", "TERMINUS", "BLOODTHIRSTER",
            "ESSENCE REAVER", "STORMRAZOR", "PHANTOM DANCER", "RAPID FIRECANNON", "STATIKK SHIV",
            "RUNAAN'S HURRICANE", "THE COLLECTOR", "LORD DOMINIK'S REGARDS", "MORTAL REMINDER",
            "SERYLDA'S GRUDGE", "BLACK CLEAVER", "DEATH'S DANCE", "RAVENOUS HYDRA", "TITANIC HYDRA",
            "TRINITY FORCE", "SPEAR OF SHOJIN", "STRIDEBREAKER", "SUNDERED SKY", "PROFANE HYDRA",
            "YOUMUU'S GHOSTBLADE", "DUSKBLADE OF DRAKTHARR", "EDGE OF NIGHT", "VOLTAIC CYCLOSWORD",
            "OPPORTUNITY", "UMBRAL GLAIVE", "SERPENT'S FANG", "BLADE OF THE RUINED KING",
            "HULLBREAKER", "GUARDIAN ANGEL", "MANAMUNE", "MURAMANA"

    ));

    public static final Set<String> weaponsAP = new HashSet<>(Arrays.asList(
            "RABADON'S DEATHCAP", "LUDEN'S COMPANION", "LIANDRY'S TORMENT", "LICH BANE",
            "NASHOR'S TOOTH", "VOID STAFF", "SHADOWFLAME", "MORELLONOMICON",
            "RYLAI'S CRYSTAL SCEPTER", "HEXTECH ROCKETBELT", "RIFTMAKER", "ROD OF AGES",
            "ARCHANGEL'S STAFF", "SERAPH'S EMBRACE", "ZHONYA'S HOURGLASS", "BANSHEE'S VEIL",
            "STORMSURGE", "CRYPTBLOOM", "MALIGNANCE", "BLACKFIRE TORCH", "DAWNCORE",
            "COSMIC DRIVE", "HORIZON FOCUS", "DEMONIC EMBRACE", "CROWN OF THE SHATTERED QUEEN",
            "SHURELYA'S BATTLESONG", "IMPERIAL MANDATE", "ECHOES OF HELIA", "MOONSTONE RENEWER",
            "STAFF OF FLOWING WATER", "ARDENT CENSER", "MIKAEL'S BLESSING", "ZAZ'ZAK'S REALMSPIKE"
    ));
}