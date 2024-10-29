def xor_bytes(a, b):
    return bytes([x ^ y for x, y in zip(a, b)])

def pad(text):
    while len(text) % 16 != 0:
        text += ' '
    return text

def encrypt_ofb(plaintext, key, iv):
    key = pad(key).encode('utf-8')[:16]
    iv = pad(iv).encode('utf-8')[:16]
    plaintext = pad(plaintext).encode('utf-8')

    cipher_blocks = []
    previous_block = iv

    for i in range(0, len(plaintext), 16):
        block = plaintext[i:i + 16]
        encrypted_block = xor_bytes(block, previous_block)
        cipher_blocks.append(encrypted_block)
        previous_block = encrypted_block

    return b''.join(cipher_blocks)

def decrypt_ofb(ciphertext, key, iv):
    return encrypt_ofb(ciphertext.decode('utf-8'), key, iv)

plaintext = input("Введите открытый текст: ")
key = input("Введите ключ (до 16 символов): ")
iv = input("Введите вектор инициализации (до 16 символов): ")

encrypted_text = encrypt_ofb(plaintext, key, iv)
print(f"Зашифрованный текст (в двоичном виде): {''.join(format(byte, '08b') for byte in encrypted_text)}")

decrypted_text = decrypt_ofb(encrypted_text, key, iv)
print(f"Расшифрованный текст: {decrypted_text.decode('utf-8').strip()}")
