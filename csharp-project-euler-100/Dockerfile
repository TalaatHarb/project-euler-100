FROM mcr.microsoft.com/dotnet/sdk:10.0-alpine AS build
WORKDIR /usr/src/app
COPY . .
RUN dotnet publish net.talaatharb.projecteuler100.Console/net.talaatharb.projecteuler100.Console.csproj -c Release -o /app/publish

FROM mcr.microsoft.com/dotnet/runtime:10.0-alpine
WORKDIR /app
COPY --from=build /app/publish .
CMD ["dotnet", "net.talaatharb.projecteuler100.Console.dll"]
