import csv
from pathlib import Path

# Example placeholder script.
# In a real implementation, collect from GitHub PR metadata, CI, issue tracker, and surveys.

rows = [
    {
        "month": "2026-04",
        "claude_assisted_prs": 58,
        "cycle_time_hours": 29,
        "avg_pr_files": 6,
        "review_rounds": 2.0,
        "review_minutes": 58,
        "failure_path_tests_added": 55,
        "post_merge_defects": 3,
        "security_findings": 1,
        "rollbacks": 0,
        "developer_survey_score": 4.1,
    }
]

output = Path("reports/adoption_metrics.csv")
output.parent.mkdir(exist_ok=True)

with output.open("w", newline="") as f:
    writer = csv.DictWriter(f, fieldnames=rows[0].keys())
    writer.writeheader()
    writer.writerows(rows)

print(f"Wrote {output}")
