# Build signed APK

Build a signed APK of your Android application

**WARNING:** This uses `apt-get` to install Java, as I didn't find better ways to install it, and, consequently, will work ONLY on Ubuntu

## Inputs

The following inputs are all required

- `keystore_b64` (optional, in alternative to `keystore_file`): the _contents of_ the keystore file (.jks), encoded as base64. (_I highly recommend you to generate this with the linux `base64` command, it did not work for me using websites to convert it._)
- `keystore_file` (optional, in alternative to `keystore`): the path to the keystore file (.jks). There's no need to encode it as base64.
- `keystore_password`: the password of the file
- `key_alias`: the alias of the key
- `key_password`: the password of the key

If both `keystore_b64` and `keystore_file` are defined, only `keystore_b64` will be used. At least one of them must be defined.

## Example

```yaml
- name: Build Signed APK
  uses: victorbnl/build-signed-apk@main
  with:
    keystore: ${{ secrets.keystore }}
    keystore_password: ${{ secrets.keystore_password }}
    key_alias: ${{ secrets.key_alias }}
    key_password: ${{ secrets.key_password }}
```

## Get your APK

The APK is built at the default location, which is: `app/build/outputs/apk/release/app-release.apk`. Feel free to do whatever you want with this apk now, like creating a release with it or putting it as an artifact of the release
