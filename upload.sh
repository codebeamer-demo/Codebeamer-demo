#!D:\Git\bin\bash.exe
#
# define a simple logging function
#
log() {
    ts="$(date --iso-8601='seconds')"
    echo -e "${ts} : $1" >> ${LOG_FILENAME}
}
LOG_FILENAME="${WORKSPACE}/target/upload.log"
# 아래 url 구하면 http 로 구해와서 https 에서는 인증성 문제 발생
# URL=$(echo ${JENKINS_URL} | awk -F":" '{print $1":"$2":7443/cb/rest/xunitresults/"}')
URL="https://icenterv05.ptc.com:7443/cb/rest/xunitresults/"
USER=$1
PASS=$2
TEST_CASE_TRACKER_ID=$3
TEST_RUN_TRACKER_ID=$4
WRKSPC=$(echo "/$WORKSPACE" | sed -e 's/\\/\//g' -e 's/://' -e 's#/C/#/c/#')
FILE=$(echo "${WORKSPACE}/target/surefire-reports/test_results.zip")

# FILE="${WORKSPACE}/target/surefire-reports/test_results.zip"

# optional params (unused here)
# testConfigurationId   - Test configuration
# testCaseId            - The parent test case id
# releaseId             - Release id for the tests
# buildIdentifier       - Build id
# defaultPackagePrefix  - Package prefix
TEST_CONFIG_ID=""
PARENT_TEST_CASE_ID=""
RELEASE_ID=""
BUILD_ID=""
PACKAGE_PREFIX=""

CFG="{\"testConfigurationId\":\"$TEST_CONFIG_ID\",\"testCaseTrackerId\":\"$TEST_CASE_TRACKER_ID\",\"testCaseId\":\"$PARENT_TEST_CASE_ID\",\"releaseId\":\"$RELEASE_ID\",\"testRunTrackerId\":\"$TEST_RUN_TRACKER_ID\",\"buildIdentifier\":\"$BUILD_ID\",\"defaultPackagePrefix\":\"$PACKAGE_PREFIX\"}"

log "CB URL: ${URL}"
log "CB LOG_FILENAME: ${LOG_FILENAME}"
log "CB Username: ${USER}"
#log "CB Password: ${PASS}"
log "Test Case Tracker ID: ${TEST_CASE_TRACKER_ID}"
log "Test Run Tracker ID: ${TEST_RUN_TRACKER_ID}"
log "Results Filename: ${FILE}"
log "Configuration: ${CFG}"

curl -v --location --request POST $URL -u "$USER:$PASS" \
    --form "configuration=$CFG"\
    --form "file=@$FILE"\

	>> ${LOG_FILENAME} 2>&1














