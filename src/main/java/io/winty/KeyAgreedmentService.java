package io.winty;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KeyAgreedmentService {
    
    public String exchange( String key ) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException{
        
        KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");

        generator.initialize( new ECGenParameterSpec("secp521r1") );
        
        KeyPair keyPair = generator.generateKeyPair();
        ECPublicKey publicKey = (ECPublicKey) keyPair.getPublic();
        
        return publicKey.toString();
    }
}
