from pathlib import Path
import json
import csv

reports = Path("reports")
summary = Path("docs/monthly-reviews/generated-learning-summary.md")
summary.parent.mkdir(parents=True, exist_ok=True)

themes = json.loads((reports / "review-comment-themes.json").read_text())

summary.write_text(f'''# Generated Monthly Learning Summary

## Repeated Review Themes

```text
Architecture comments: {themes["architecture_boundary_comments"]}
Security/PII comments: {themes["security_or_pii_comments"]}
API contract comments: {themes["api_contract_comments"]}
Test quality comments: {themes["test_quality_comments"]}
Rollback comments: {themes["rollback_comments"]}
```

## Recommended Updates

{chr(10).join("- " + item for item in themes["recommended_updates"])}
''')

print(f"Wrote {summary}")
