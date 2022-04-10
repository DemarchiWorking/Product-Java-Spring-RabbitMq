FROM gradle:7.0.0-jdk11
COPY --chown=gradle:gradle . .
WORKDIR .
RUN gradle build
EXPOSE 8081
CMD ["gradle", "bootRun"]