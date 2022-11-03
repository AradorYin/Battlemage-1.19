package net.aradoryin.battlemage;

public class Notes
{
    /*
     * Description: This determines how well you've mastered a particular school of magic. With fire, that means
	 * damage over time. With ice, that means freezing or slowing down enemies. (I think this affects Critical chance,
	 * which give you the status effects when you charge an attack.)
	 *
	 * Here's where this game's ingenuity shines more than anywhere else. When you defeat a monster, or destroy one of
	 * those orange egg/nest/swarm things, you'll be rewarded with an item. You can also be rewarded for finding
	 * scrolls, checking out those weird-looking rifts (the long purple and black things, that cause you to see purple
	 * holograms and wonder "is this real life?"), or going to those pinkish-red areas with bones or the remains of
	 * less-fortunate characters (or NPCs).
	 *
	 * Shapes - Targeted, AOE, Barrier, Shield (Barrier is NOT the same as shield)
	 * Augments - Control, Mastery and Destruction
	 *
	 * Items also come in several rarity levels. You've got Common (white), uncommon (green), rare (blue), epic (purple),
	 * and legendary (color unknown to me so far). These indicate how valuable or powerful an item is.
	 *
	 * 3x Common (white) => 1x Uncommon (green)
	 * 3x Uncommon (green) => 1x Rare (blue)
	 * 3x Rare (blue) => 1x Epic (purple)
	 * 3x Epic (purple) => 1x Legendary (orange)
	 *
	 * (Three Legendary items, as I've found out the hard way, don't make anything better. They just give you a concussion
	 * once you realize what you've done, and they have about an 80% chance to dent your desk or flatten your keyboard.
	 * Why is it 80% chance? Because if it takes you 3 out of 4 times to realize your mistake, you'll end up slamming your
	 * face against the desk a fourth time because you didn't realize just how stupid what you were doing really was.)
	 *
	 * When synthesizing, try to synthesize three items of the same rarity type, and of the same sub-type. Example: If you
	 * synthesize 3x Control Augment (common rarity), you can get either an Uncommon Shape (random) or an Uncommon Control
	 * Augment.
	 *
	 * However, you can also synthesize three different Augments of the same rarity, in which case you'll get either a
	 * random Augment or a random Shape of one rarity level above. Example: If you Synthesize 2x Uncommon Targeted Shape
	 * and 1x Uncommon Barrier Shape, you can get either a Rare Shape or a Rare Augment.
	 *
	 * You can also synthesize a Spell (that's been crafted), an Augment and a Shape - but you'll get a random item.
	 *
	 * Overall, save up your items, and synthesize items so you can get the items you want. Saving Destruction Augments and
	 * Targeted Shapes can be one of the more awesome things you do, especially if you can get a really nice Homing Targeted
	 * Shape (which allows you to be less precise when aiming, and can help you even if you enemy moves out of the way from
	 * where the spell was going). This is especially nice when trying to use crowd control to slow down or freeze that
	 * ranged enemy, and then get up close and personal to finish (and ditch the mob of close-quarter enemies that are
	 * probably surrounding you right about now).
	 *
	 * And for the holy gourd's sake, save your Shield Patterns. You'll want to use them, trust me. And ditch the
	 * "Quick" shields, because they may be quick, but they break easily. You're better off with more HP in your Shield,
	 * since sometimes you can't avoid getting hit when there are too many enemies. If you've got a Quick Shield pattern,
	 * try to use it later to Synthesize another Shield of a better rarity, but don't feel afraid to toss it in with two
	 * other Shapes to get a more useful Shape of another kind - and yes, it's that bad.

    Core Notes on the mod are as follows:
    1. The spells and guidebook are done through the bracer.
    2. 3 elements can be chosen to be used at any given time with 3 spells per element. Exception to this is
        early game for the mod where you are just getting started.
    3. Exploration is a key factor.

    Individual Notes for the ideas of the mod are listed below.
    Gems:
    1. Amethyst -> Harder hitting AugmentType.MASTERY spells
    2. Citrine -> More focused AugmentType.MASTERY spells
    3. Diamond -> Longer lasting AugmentType.CONTROL spells
    4. Emerald -> Longer lasting AugmentType.MASTERY spells
    5. Onyx -> Longer lasting AugmentType.INTENSITY spells
    6. Quartz -> Harder hitting AugmentType.CONTROL spells
    7. Ruby -> Harder hitting AugmentType.INTENSITY spells
    8. Sapphire -> More focused AugmentType.CONTROL spells
    9. Tiger's Eye -> More focused AugmentType.INTENSITY spells
    Elements:
    1. Corruption -> Mastery
    2. Delirium -> Mastery
    3. Earth -> Destruction
    4. Fire -> Destruction
    5. Ice -> Control
    6. Kinesis -> Control
    7. Lightning -> Mastery
    8. Necromancy -> Destruction
    9. Phase -> Control
    Spell Choices:
    1. Single-Target -> Single-Target | Ray | Grenade
    2. Area of Effect -> Area of Effect | Pool | Trap
    3. Shield
    Augments:
    1. Control -> This determines how well you control the "Shape" of your Spell. So this means the general
        characteristics of Targeted Spells, Shield, Barrier and AOE. Things like area, speed of projectile, and things
        of that nature fall in here.
    2. Destruction -> Destruction is the Spell's Intensity. For Shield, that means how much "HP" your Shield has.
        In Targeted spells, it means direct damage. Etc. It could be renamed "Intensity" so it's easier to understand.
    3. Mastery -> This determines how well you've mastered a particular school of magic. With fire, that means damage
        over time. With ice, that means freezing or slowing down enemies. (I think this affects Critical chance,
        which give you the status effects when you charge an attack.)

    Concepts.
    Gems:
    1. The gems can be engraved with the sigil of an element to focus the elemental powers through.
    2. The gems have an inherent ability with certain elements. Maybe I can use this as an early means of choosing my
        elements?
    3. The gems alter some aspects of the elemental powers passing through them. Maybe I can discover what aspects
        they alter and use that to my advantage?
    4. Maybe I can alter the Elemental Obelisks with certain types of gems to influence magical crafting?
    5. I seem to be able to purchase some gems from some local tradesmen. I wonder if they will have better
        quality gems for sale.
    6.
    Elements:
    1. The elements have different effects on the mortal planes of existence.
    2. Some entities roaming about appear to have some kind of resistance to some elements.
    3. Some elements seem to have status debuffs or buffs. I wonder if I can stack these to multiply the damage done
        to mine enemies?
    4. I might be able to make more Elemental Sigils using a magical apparatus. I wonder what uses these Elemental
        Sigils are there.
    5.
Ice Powder -> AugmentType.CONTROL
Gold Powder -> AugmentType.MASTERY
Iron Powder -> AugmentType.DESTRUCTION
    Spells:
    1. There seem to be 3 different spell choices. Maybe if I build a magical apparatus if that would help me build
        what spells I want?
    2. The spells choices that I seem to be limited to have different functions. One attacks a single target; another
        seems to attack an area using some kind of explosion; and the last one seems to create a magical forcefield
        in front of me as a means of protection.
    3. I have noticed that the basic spell using single target functionality appears to rotate between different
        options. I have noticed the regular single target spell, a beam of elemental energy, and a grenade of
        elemental energy.
    4. I have also noticed that my area of effect spells also cycle through some different spell options. Those options
        seem to be the normal area of effect explosion that may break some blocks around it, a pool of elemental energy
        that appears to be some kind of damage over time effect, and a rune. The rune does not appear to be affected
        by me, but maybe it is some kind of trap rune for my enemies to stumble into? I wonder what effect each
        element has.
    5. There is a unique interaction with the basic shield spell. I have noted this interaction being like a nova of
        elemental energy that emanates outwards from in front of my person. Each element seems to have a different
        nova when I manage to perfectly time a block.
    6. I don't seem to run when I am carrying the bracer. I seem to teleport a short distance in the direction that
        I originally planned to run in instead. I have also concluded that my shield seems to somehow affect this
        "dash".
    7.
    Bracer:
    1. I have crafted a leather strap to tie around my wrist to attach a gem to.
    2. For some reason this strap - which I have dubbed as a "bracer" - seems to be made of a poor quality, but will
        allow me to focus the elements that seem to be around me.
    3. Maybe if I manage to create better versions of this "bracer" that it will amplify the elemental energies at my
        disposal?
    4. What if I weave in some threads of iron, gold, copper? What if I attach some wool, would the color of the wool
        affect the outcome of my "magical workings"? What happens if I apply studs to the "bracer"? Maybe if the studs
        were made of metals, gems, a Nether Star I might get some beneficial effects to the elemental energies I choose
        to wield.
    5. There are times, when I decide to not use this "bracer" for spells, that I am filled with random bits of
        information.
    6.
    Structures:
    1. Elemental Obelisks: structures of an unknown and unique origin. Randomly found obelisks can only be used once
        before becoming dormant. These structures might have grown into their shape long ago and since had their innate
        magical potential sapped from them. No one knows or will ever know more about these structures. I could build
        them and influence my magical crafting with a specific element. Maybe I would have a chance at getting a
        Pristine or Legendary quality of the items being crafted? I wonder what would happen if I inserted a gem
        into the obelisks. For me to build one, I first need to craft Magic-Infused Stone to be used as a cage-like
        structure. The core needs to be an Elemental Core, which can only be made using an Elemental Sigil. I wonder
        how I am going to get the Elemental Blocks needed to surround the core. Maybe I "magic" the Magic-Infused
        Stone?
        Layer 5
        "SSS" : "S: Magic-Infused Stone"
        "SSS" : "S: Magic-Infused Stone"
        "SSS" : "S: Magic-Infused Stone"
        Layer 4
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        "EEE" : "E: Elemental Block"
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        Layer 3
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        "ECE" : "S: Magic-Infused Stone | E: Elemental Block | C: Elemental Core"
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        Layer 2
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        "EEE" : "E: Elemental Block"
        "SES" : "S: Magic-Infused Stone | E: Elemental Block"
        Layer 1
        "SSS" : "S: Magic-Infused Stone"
        "SSS" : "S: Magic-Infused Stone"
        "SSS" : "S: Magic-Infused Stone"
    2.
     */
}
