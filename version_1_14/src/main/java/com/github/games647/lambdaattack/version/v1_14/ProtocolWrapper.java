package com.github.games647.lambdaattack.version.v1_14;

import com.github.games647.lambdaattack.GameVersion;
import com.github.games647.lambdaattack.UniversalProtocol;
import com.github.steveice10.mc.protocol.MinecraftProtocol;
import com.github.steveice10.packetlib.packet.PacketProtocol;

// ------------------------------
// Copyright (c) PiggyPiglet 2019
// https://www.piggypiglet.me
// ------------------------------
public class ProtocolWrapper extends MinecraftProtocol implements UniversalProtocol {
    public ProtocolWrapper(String username) {
        super(username);
    }

    @Override
    public PacketProtocol getProtocol() {
        return this;
    }

    @Override
    public GameVersion getGameVersion() {
        return GameVersion.VERSION_1_14;
    }
}
