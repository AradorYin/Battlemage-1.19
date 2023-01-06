package net.aradoryin.battlemage.notes;

public class Notes
{
    /*
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
    6. Opal -> More focused AugmentType.INTENSITY spells
    7. Quartz -> Harder hitting AugmentType.CONTROL spells
    8. Ruby -> Harder hitting AugmentType.INTENSITY spells
    9. Sapphire -> More focused AugmentType.CONTROL spells
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
	 Qualities:
	 1. Trash -> Gray
	 2. Common -> White
	 3. Uncommon -> Green
	 4. Rare -> Blue
	 5. Epic -> Purple
	 6. Legendary -> Orange
    Quality Upgrades:
	 1. 3X Common -> 1X Uncommon
	 2. 3X Uncommon -> 1X Rare
	 3. 3X Rare -> 1X Epic
	 4. 3X Epic -> 1X Legendary

    Concepts.
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
    5. There are times, when I decide to not use this "bracer" for spells, that I am instead filled with random bits of
        information.
    6.
    Plants:
    1. Pustule Fungus -> Parasitic fungus usually found on trees. Once the pustule enlarges and starts glowing a faint
        orange color, the fungus can be broken to obtain a random spell base ingredient.
    2.
    Mobs:
    1. Unnamed Humans
        1. Akin to randomly roaming barbarians too clumsy to even learn how to reason properly. Only useful in fighting
         and getting mob drops.
        2. Sounds: Vindicator-branching sounds
        3. Appearance: rags/random bits of armor
    3. Named Humans
    4. Regular Beasts
    5. Plagued Beasts
    6. Unnamed Spirits
    7. Named Spirits
    8. Unnamed Undead
    9. Named Undead
    Synthesizing:
    1. There seems to be many options when I try to synthesize spells, both during and after. I could add the gem
        powders I acquired from pulverizing them to somehow augment the spell in different ways. However, there are
        some things that I cannot keep from the spell creation process. These things - Spell Base, Elemental Sigil -
        seem almost mandatory, but everything else is optional. I could add Ice Powder as a means of influencing the
        control aspect of spells, Copper Powder for mastery, and Gold Powder for destruction.

	 When synthesizing, try to synthesize three items of the same rarity type, and of the same subtype. Example: If you
	 synthesize 3x Control Augment (common rarity), you can get either an Uncommon Shape (random) or an Uncommon Control
	 Augment.

	 However, you can also synthesize three different Augments of the same rarity, in which case you'll get either a
	 random Augment or a random Shape of one rarity level above. Example: If you Synthesize 2x Uncommon Targeted Shape
	 and 1x Uncommon Barrier Shape, you can get either a Rare Shape or a Rare Augment.

	 You can also synthesize a Spell (that's been crafted), an Augment and a Shape - but you'll get a random item.

----------------------------
particle system will need to be figured out. maybe create a helper particle class as a base from which to expand upon for the Shield, Ray, Targeted Lob, Targeted Normal, AoE, Pool, Trap. maybe have the class take in a particle texture, double radius or double diameter with a method overload adding in a double duration.

might be able to cheat and use the tnt particles to use for the center of the AoE Particle class. but will need the circular outline showing the area of effect.
     */
}
