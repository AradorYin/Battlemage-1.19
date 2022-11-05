package net.aradoryin.battlemage.notes;

public class NotesItems
{
    /*
    Items
    Gems:
    1. Amethyst:
        1. Raw Amethyst -> Mined from ore
        2. Uncut Amethyst -> Smelted*1 -> Block
        3. Trash Amethyst -> 100% chance with no Elemental Obelisks -> Block
        4. Common Amethyst -> Higher chance with fewer Elemental Obelisks -> Block
        5. Uncommon Amethyst -> Higher chance with at least 2 Elemental Obelisks -> Block
        6. Rare Amethyst -> Higher chance with at least 4 Elemental Obelisks -> Block
        7. Epic Amethyst -> Higher chance with at least 7 Elemental Obelisks -> Block
        8. Legendary Amethyst -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    2. Citrine
        1. Raw Citrine -> Mined from ore
        2. Uncut Citrine -> Smelted*1 -> Block
        3. Trash Citrine -> 100% chance with no Elemental Obelisks -> Block
        3. Common Citrine -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Citrine -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Citrine -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Citrine -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Citrine -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    3. Diamond
        1. Raw Diamond -> Mined from ore
        2. Uncut Diamond -> Smelted*1 -> Block
        3. Trash Diamond -> 100% chance with no Elemental Obelisks -> Block
        3. Common Diamond -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Diamond -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Diamond -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Diamond -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Diamond -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    4. Emerald
        1. Raw Emerald -> Mined from ore
        2. Uncut Emerald -> Smelted*1 -> Block
        3. Trash Emerald -> 100% chance with no Elemental Obelisks -> Block
        3. Common Emerald -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Emerald -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Emerald -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Emerald -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Emerald -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    5. Onyx
        1. Raw Onyx -> Mined from ore
        2. Uncut Onyx -> Smelted*1 -> Block
        3. Trash Onyx -> 100% chance with no Elemental Obelisks -> Block
        3. Common Onyx -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Onyx -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Onyx -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Onyx -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Onyx -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    6. Opal
        1. Raw Opal -> Mined from ore
        2. Uncut Opal -> Smelted*1 -> Block
        3. Trash Opal -> 100% chance with no Elemental Obelisks -> Block
        3. Common Opal -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Opal -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Opal -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Opal -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Opal -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    7. Quartz
        1. Raw Quartz -> Mined from ore
        2. Uncut Quartz -> Smelted*1 -> Block
        3. Trash Quartz -> 100% chance with no Elemental Obelisks -> Block
        3. Common Quartz -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Quartz -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Quartz -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Quartz -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Quartz -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    8. Ruby
        1. Raw Ruby -> Mined from ore
        2. Uncut Ruby -> Smelted*1 -> Block
        3. Trash Ruby -> 100% chance with no Elemental Obelisks -> Block
        3. Common Ruby -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Ruby -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Ruby -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Ruby -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Ruby -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    9. Sapphire
        1. Raw Sapphire -> Mined from ore
        2. Uncut Sapphire -> Smelted*1 -> Block
        3. Trash Sapphire -> 100% chance with no Elemental Obelisks -> Block
        3. Common Sapphire -> Higher chance with fewer Elemental Obelisks -> Block
        4. Uncommon Sapphire -> Higher chance with at least 2 Elemental Obelisks -> Block
        5. Rare Sapphire -> Higher chance with at least 4 Elemental Obelisks -> Block
        6. Epic Sapphire -> Higher chance with at least 7 Elemental Obelisks -> Block
        7. Legendary Sapphire -> Only chance at crafting requires all 9 Elemental Obelisks -> Block
    Elements:
    1. Corruption
1. Sigil
2. Corruption-Infused Block
    2. Delirium
1. Sigil
2. Delirium-Infused Block
    3. Earth
1. Sigil
2. Earth-Infused Block
    4. Fire
1. Sigil
2. Fire-Infused Block
    5. Ice
1. Sigil
2. Ice-Infused Block
    6. Lightning
1. Sigil
2. Lightning-Infused Block
    7. Kinesis
1. Sigil
2. Kinesis-Infused Block
    8. Necromancy
1. Sigil
2. Necromancy-Infused Block
    9. Phase
1. Sigil
2. Phase-Infused Block
    Spells:
    1. Single Target
1. Sigil
    2. Ray
1. Sigil
    3. Grenade
1. Sigil
    4. Area of Effect
1. Sigil
    5. Pool
1. Sigil
    6. Trap
1. Sigil
    7. Shield
1. Sigil
    Augments:
    1. Control
    2. Destruction
    3. Mastery
    Qualities:
Common|Uncommon|Rare|Epic|Legendary
     */
}
