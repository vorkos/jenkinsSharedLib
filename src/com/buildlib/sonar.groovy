package com.buildlib
@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

/**
*
*
**/

class SonarQube implements Serializable {
    def script
    protected Map config
}